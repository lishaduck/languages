package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Bourne : Thompson() {
    override val name = "Bourne Shell"
    override val creator = "Stephen Bourne"
    override val year = 1977
    override val extensions = setOf(".sh")
    override val paradigms = setOf(Paradigm.Imperative, Paradigm.Procedural)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = false,
        strong = false,
        duck = false,
        nominal = false,
        inferred = true,
        gradual = false,
        dependent = false,
        generic = false,
    )
    override val hasGarbageCollector = true
    override val isPlatformIndependent = false
    override val isOpenSource = true
    override val supportsConcurrency = true
    override val isMultithreaded = false
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = false
    override val isCaseSensitive = true
    override val isStrictlyEvaluated = true
}
