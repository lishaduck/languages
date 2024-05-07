package data

import meta.Paradigm

open class Rocq : Lisp() {
    override val name = "Rocq" // Formerly Coq
    override val creator = "Thierry Coquand"
    override val year = 1989
    override val paradigms = setOf(Paradigm.Functional)
}
