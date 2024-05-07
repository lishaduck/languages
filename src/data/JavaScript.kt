package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class JavaScript : Self() {
    override val creator = "Brendan Eich"
    override val year = 1995
    override val extensions = setOf(".js", ".cjs")
    override val paradigms = setOf(Paradigm.ObjectOriented, Paradigm.Imperative, Paradigm.Functional)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = false,
        strong = false,
        duck = true,
        nominal = false,
        inferred = true,
        gradual = true,
        dependent = false,
        generic = true
    )
}
