var ASMAPI = Java.type("net.minecraftforge.coremod.api.ASMAPI");
var Opcodes = Java.type("org.objectweb.asm.Opcodes");

var TARGET_CLASS = "net.chaolux.jadensnetherexpansiondelight.registry.block.ModBlocks";

var OLD_OWNER = "vectorwing/farmersdelight/common/block/HoneyGlazedHamBlock";
var NEW_OWNER = "vectorwing/farmersdelight/common/block/FeastBlock";

// Both ShepherdsPieBlock and FeastBlock use this constructor shape in the ModBlocks:
// new X(BlockBehaviour.Properties, Supplier<Item>, boolean)
var CTOR_DESC =
    "(Lnet/minecraft/world/level/block/state/BlockBehaviour$Properties;Ljava/util/function/Supplier;Z)V";

function initializeCoreMod() {
    return {
        "jadensnetherexpansiondelight_ham_to_feast": {
            "target": {
                "type": "CLASS",
                "name": TARGET_CLASS
            },
            "transformer": function(classNode) {
                var changed = 0;

                for (var i = 0; i < classNode.methods.size(); i++) {
                    var method = classNode.methods.get(i);
                    var instructions = method.instructions;

                    for (var instruction = instructions.getFirst(); instruction != null; instruction = instruction.getNext()) {
                        // Replace: NEW vectorwing/farmersdelight/common/block/HoneyGlazedHamBlock
                        if (instruction.getOpcode && instruction.getOpcode() === Opcodes.NEW) {
                            if (instruction.desc === OLD_OWNER) {
                                //NEW: desc is class internal name
                                instruction.desc = NEW_OWNER;
                                changed++;
                            }
                        }

                        // Replace:
                        // INVOKESPECIAL vectorwing/farmersdelight/common/block/HoneyGlazedHamBlock.<init>(Properties, Supplier, boolean)V
                        if (instruction.getOpcode && instruction.getOpcode() === Opcodes.INVOKESPECIAL) {
                            if (
                                instruction.owner === OLD_OWNER &&
                                instruction.name === "<init>" &&
                                instruction.desc === CTOR_DESC
                            ) {
                                instruction.owner = NEW_OWNER;
                                changed++;
                            }
                        }
                    }
                }

                ASMAPI.log(
                    "INFO",
                    "[MND Fix] Retargeted " + changed +
                    " HoneyGlazedHamBlock constructor references to FeastBlock in " +
                    TARGET_CLASS
                );

                return classNode;
            }
        }
    };
}