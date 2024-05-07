package data

import meta.Paradigm

open class Smalltalk : Simula() {
    override val paradigms = setOf(Paradigm.Reflective, Paradigm.ObjectOriented)
}
