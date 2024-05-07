package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class VisualBasic : BASIC() {
    override val name = "Visual Basic"
    override val creator = "Microsoft"
    override val year = 1991
    override val extensions = setOf(".vb")
    override val paradigms = setOf(Paradigm.ObjectOriented)
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
    override val isOpenSource = false
    override val supportsConcurrency = false
    override val isMultithreaded = false
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = true
    override val isCaseSensitive = false
    override val isStrictlyEvaluated = true
}
