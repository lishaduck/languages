package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class CSharp : Java() {
    override val name = "C#"
    override val creator = "Anders Hejlsberg"
    override val year = 2000
    override val extensions = setOf(".cs")
    override val paradigms = setOf(Paradigm.ObjectOriented, Paradigm.Imperative, Paradigm.Declarative)
    override val runtype = setOf(RunType.AheadOfTimeCompiled)
    override val typeSystem = TypeSystem(
        static = true,
        strong = true,
        duck = false,
        nominal = true,
        inferred = false,
        gradual = false,
        dependent = false,
        generic = true
    )
    override val hasGarbageCollector = true
    override val isPlatformIndependent = false
    override val isOpenSource = true
    override val supportsConcurrency = true
    override val isMultithreaded = true
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = true
    override val isCaseSensitive = true
}
