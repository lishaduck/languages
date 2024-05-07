package meta

import java.io.File

abstract class ProgrammingLanguage {
    abstract val name: String
    abstract val creator: String
    abstract val year: Int
    abstract val extensions: Set<String>
    abstract val paradigms: Set<Paradigm>
    abstract val runtype: Set<RunType>
    abstract val typeSystem: TypeSystem
    abstract val hasGarbageCollector: Boolean
    abstract val isPlatformIndependent: Boolean
    abstract val isOpenSource: Boolean
    abstract val supportsConcurrency: Boolean
    abstract val isMultithreaded: Boolean
    abstract val isLowLevel: Boolean
    abstract val isSandboxed: Boolean
    abstract val supportsUnicode: Boolean
    abstract val isCaseSensitive: Boolean
    abstract val isStrictlyEvaluated: Boolean

    override fun toString(): String {
        return name
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is ProgrammingLanguage) return false

        return name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }

    open suspend fun compile(source: File) {
        println("Compiling $name source code: $source")
    }
}


enum class Paradigm {
    ObjectOriented,
    Functional,
    Procedural,
    Imperative,
    Declarative,
    Reflective,
}


enum class RunType {
    Interpreted,
    JustInTimeCompiled,
    AheadOfTimeCompiled
}


data class TypeSystem(
    val static: Boolean,
    val strong: Boolean,
    val duck: Boolean,
    val nominal: Boolean,
    val inferred: Boolean,
    val gradual: Boolean,
    val dependent: Boolean,
    val generic: Boolean,
)

