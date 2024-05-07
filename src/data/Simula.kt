package data

import meta.Paradigm

open class Simula : ALGOL() {
    override val creator = "Ole-Johan Dahl"
    override val year = 1967
    override val extensions = setOf(".sim", ".simula")
    override val paradigms = setOf(Paradigm.ObjectOriented)
    override val hasGarbageCollector = true
}
