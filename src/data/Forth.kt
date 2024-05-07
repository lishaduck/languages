package data

import meta.Paradigm
import meta.ProgrammingLanguage
import meta.RunType
import meta.TypeSystem

open class Forth : ProgrammingLanguage() {
    override val name = "Forth"
    override val creator = "Charles H. Moore"
    override val year = 1970
    override val extensions = setOf(".4th", ".fth", ".frt", ".fs")
    override val paradigms = setOf(Paradigm.Procedural, Paradigm.Reflective)
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
    override val isOpenSource = true
    override val supportsConcurrency = false
    override val isMultithreaded = false
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = false
    override val isCaseSensitive = true
    override val isStrictlyEvaluated = true
}
