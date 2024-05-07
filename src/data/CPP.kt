package data

import meta.Paradigm
import meta.TypeSystem

open class CPP : C() {
    override val name = "C++"
    override val creator = "Bjarne Stroustrup"
    override val year = 1985
    override val extensions = setOf(".cpp", ".hpp")
    override val paradigms = setOf(Paradigm.ObjectOriented, Paradigm.Procedural)
    override val typeSystem = TypeSystem(
        static = true,
        strong = true,
        duck = false,
        nominal = false,
        inferred = false,
        gradual = false,
        dependent = false,
        generic = true
    )
}
