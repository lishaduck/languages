package data

import meta.Paradigm

open class Pharo : Smalltalk() {


    override var paradigms = setOf(Paradigm.ObjectOriented, Paradigm.Functional, Paradigm.Reflective)


}
