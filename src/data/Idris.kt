package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Idris : Haskell() {
    override val name = "Idris"
    override val creator = "Edwin Brady"
    override val year = 2007
    override val extensions = setOf(".idr")
    override val paradigms = setOf(Paradigm.Functional, Paradigm.Declarative)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = true,
        strong = true,
        duck = false,
        nominal = true,
        inferred = true,
        gradual = true,
        dependent = true,
        generic = true
    )
    override val isStrictlyEvaluated = true

}
