package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem

open class BASIC : Fortran() {
    override val name = "BASIC"
    override val creator = "John G. Kemeny"
    override val year = 1964
    override val extensions = setOf(".bas", ".bi", ".bb", ".vbs", ".vba", ".vbe", ".vbscript")
    override val paradigms = setOf(Paradigm.Procedural, Paradigm.ObjectOriented)
    override val runtype = setOf(RunType.Interpreted)
    override val typeSystem = TypeSystem(
        static = true,
        strong = true,
        duck = false,
        nominal = true,
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
    override val supportsUnicode = true
    override val isCaseSensitive = false
    override val isStrictlyEvaluated = false
}
