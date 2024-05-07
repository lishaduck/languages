package data

import meta.Paradigm
import meta.ProgrammingLanguage
import meta.RunType
import meta.TypeSystem

open class Fortran : ProgrammingLanguage() {
    override val name = "Fortran"
    override val creator = "John Backus"
    override val year = 1957
    override val extensions = setOf(".f", ".for", ".f90", ".f95", ".f03", ".f08")
    override val paradigms = setOf(Paradigm.Imperative, Paradigm.Procedural, Paradigm.ObjectOriented)
    override val runtype = setOf(RunType.AheadOfTimeCompiled)
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
    override val hasGarbageCollector = false
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
