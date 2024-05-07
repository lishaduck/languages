package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Rust : ML() {
    override val creator = "Graydon Hoare"
    override val year = 2006
    override val extensions = setOf(".rs")
    override val paradigms = setOf(Paradigm.Imperative, Paradigm.Functional, Paradigm.ObjectOriented)
    override val runtype = setOf(RunType.AheadOfTimeCompiled)
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
    override val hasGarbageCollector = false
    override val isPlatformIndependent = true
    override val isOpenSource = true
    override val supportsConcurrency = true
    override val isMultithreaded = true
    override val isLowLevel = true
    override val isSandboxed = false
    override val supportsUnicode = true
    override val isCaseSensitive = true
    override val isStrictlyEvaluated = true
}
