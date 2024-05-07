package data

import meta.Paradigm
import meta.ProgrammingLanguage
import meta.RunType
import meta.TypeSystem

open class Batch : ProgrammingLanguage() {
    override val name = "Batch"
    override val creator = "Gary Kildall"
    override val year = 1970
    override val extensions = setOf(".bat")
    override val paradigms = setOf(Paradigm.Imperative)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = true,
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
