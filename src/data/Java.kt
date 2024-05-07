package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class Java : C() {
    override val name = "Java"
    override val creator = "James Gosling"
    override val year = 1995
    override val extensions = setOf(".java")
    override val paradigms = setOf(Paradigm.ObjectOriented, Paradigm.Imperative)
    override val runtype = setOf(RunType.Interpreted, RunType.JustInTimeCompiled)
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
    override val isPlatformIndependent = true
    override val isOpenSource = true
    override val supportsConcurrency = true
    override val isMultithreaded = true
    override val isLowLevel = false
    override val isSandboxed = true
    override val supportsUnicode = true
    override val isCaseSensitive = true
}
