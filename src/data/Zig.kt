package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Zig : C() {
    override val name = "Zig"
    override val creator = "Andrew Kelley"
    override val year = 2016
    override val extensions = setOf(".zig", ".zon")
    override val paradigms = setOf(Paradigm.Imperative)
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
