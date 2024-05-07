package data

import meta.Paradigm
import meta.ProgrammingLanguage
import meta.RunType
import meta.TypeSystem

open class FlowMatic : ProgrammingLanguage() {
    override val name = "FlowMatic"
    override val creator = "Grace Hopper"
    override val year = 1955
    override val extensions = setOf(".flm")
    override val paradigms = setOf(Paradigm.Imperative)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = false,
        strong = false,
        duck = false,
        nominal = false,
        inferred = false,
        gradual = false,
        dependent = false,
        generic = false
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
