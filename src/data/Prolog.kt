package data

import meta.Paradigm
import meta.ProgrammingLanguage
import meta.RunType
import meta.TypeSystem

open class Prolog : ProgrammingLanguage() {
    override val name = "Prolog"
    override val creator = "Alain Colmerauer"
    override val year = 1972
    override val extensions = setOf(".pl", ".pro")
    override val paradigms = setOf(Paradigm.Declarative)
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
    override val isMultithreaded = true
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = true
    override val isCaseSensitive = false
    override val isStrictlyEvaluated = true
}
