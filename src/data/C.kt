package data

import meta.Paradigm
import meta.RunType
import meta.TypeSystem
import java.io.File

open class C : B() {
    override val name = "C"
    override val creator = "Dennis Ritchie"
    override val year = 1972
    override val extensions = setOf(".c", ".h")
    override val paradigms = setOf(Paradigm.Procedural, Paradigm.Imperative)
    override val runtype = setOf(RunType.AheadOfTimeCompiled)
    override val typeSystem = TypeSystem(
        static = true,
        strong = true,
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
    override val supportsConcurrency = true
    override val isMultithreaded = true
    override val isLowLevel = true
    override val isSandboxed = false
    override val supportsUnicode = true
    override val isCaseSensitive = true
    override val isStrictlyEvaluated = true

    override suspend fun compile(source: File) {
//        val command = "gcc -o ${source.path}"
//        withContext(Dispatchers.IO) {
//            val process = ProcessBuilder(*command.split(" ").toTypedArray())
//                .redirectOutput(ProcessBuilder.Redirect.INHERIT)
//                .start()
//            process.waitFor()
//        }
    }
}
