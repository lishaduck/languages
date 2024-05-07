package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Kotlin : Java() {
    override val name = "Kotlin"
    override val creator = "JetBrains"
    override val year = 2011
    override val extensions = setOf(".kt", ".kts")
    override val paradigms = setOf(Paradigm.ObjectOriented, Paradigm.Functional)
    override val runtype = setOf(RunType.AheadOfTimeCompiled, RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = true,
        strong = true,
        duck = false,
        nominal = true,
        inferred = true,
        gradual = false,
        dependent = false,
        generic = true
    )
}
