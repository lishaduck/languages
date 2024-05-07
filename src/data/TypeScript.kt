package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class TypeScript : EcmaScript() {
    override val name = "TypeScript"
    override val creator = "Microsoft"
    override val year = 2012
    override val extensions = setOf(".ts", ".tsx")
    override val paradigms = setOf(Paradigm.ObjectOriented, Paradigm.Functional)
    override val runtype = setOf(RunType.AheadOfTimeCompiled)
    override val typeSystem = TypeSystem(
        static = true,
        strong = true,
        duck = true,
        nominal = true,
        inferred = true,
        gradual = true,
        dependent = true,
        generic = true,
    )
}
