package data

import meta.Paradigm
import meta.ProgrammingLanguage
import meta.RunType
import meta.TypeSystem

open class Nix : ProgrammingLanguage() {
    override val name = "Nix"
    override val creator = "Eelco Dolstra"
    override val year = 2003
    override val extensions = setOf(".nix")
    override val paradigms = setOf(Paradigm.Functional, Paradigm.Declarative)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = false,
        strong = true,
        duck = false,
        nominal = false,
        inferred = false,
        gradual = false,
        dependent = false,
        generic = true,
    )
    override val hasGarbageCollector = true
    override val isPlatformIndependent = true
    override val isOpenSource = true
    override val supportsConcurrency = false
    override val isMultithreaded = false
    override val isLowLevel = false
    override val isSandboxed = false
    override val supportsUnicode = true
    override val isCaseSensitive = true
    override val isStrictlyEvaluated = false
}
