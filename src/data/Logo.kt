package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Logo : Lisp() {
    override val name = "Logo"
    override val creator = "Seymour Papert"
    override val year = 1962
    override val extensions = setOf(".lgo")
    override val paradigms = setOf(Paradigm.Functional)
    override val runtype = setOf(RunType.Interpreted, RunType.AheadOfTimeCompiled)
    override val typeSystem = TypeSystem(
        static = false,
        strong = true,
        duck = false,
        nominal = true,
        inferred = true,
        gradual = false,
        dependent = false,
        generic = false
    )
    override val hasGarbageCollector = true
    override val isPlatformIndependent = true
    override val isOpenSource = true
    override val supportsConcurrency = false
    override val isMultithreaded = false
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = false
    override val isCaseSensitive = false
    override val isStrictlyEvaluated = true
}
