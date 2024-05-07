package data

import meta.Paradigm
import meta.ProgrammingLanguage
import meta.RunType
import meta.TypeSystem

open class Lisp : ProgrammingLanguage() {
    override val name = "Lisp"
    override val creator = "John McCarthy"
    override val year = 1958
    override val extensions = setOf(".lisp", ".lsp", ".l", ".cl", ".fasl", ".el")
    override val paradigms = setOf(Paradigm.Functional)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = false,
        strong = false,
        duck = false,
        nominal = false,
        inferred = true,
        gradual = false,
        dependent = false,
        generic = false
    )
    override val hasGarbageCollector = true
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
