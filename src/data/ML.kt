package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class ML : ALGOL() {
    override val name = "ML"
    override val creator = "Robin Milner"
    override val year = 1973
    override val extensions = setOf(".ml")
    override val paradigms = setOf(Paradigm.Functional)
    override val runtype = setOf(RunType.Interpreted)
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
    override val hasGarbageCollector = true
    override val isPlatformIndependent = false
    override val isOpenSource = true
    override val supportsConcurrency = true
    override val isMultithreaded = true
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = true
    override val isCaseSensitive = true
    override val isStrictlyEvaluated = true
}
