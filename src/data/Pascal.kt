package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Pascal : ALGOL() {
    override val name = "Pascal"
    override val creator = "Niklaus Wirth"
    override val year = 1970
    override val extensions = setOf(".pas")
    override val paradigms = setOf(Paradigm.Imperative)
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
    override val hasGarbageCollector = false
    override val isPlatformIndependent = false
    override val isOpenSource = false
    override val supportsConcurrency = false
    override val isMultithreaded = false
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = false
    override val isCaseSensitive = true
    override val isStrictlyEvaluated = true
}
