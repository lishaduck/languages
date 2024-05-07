package data

import meta.Paradigm
import meta.RunType

open class Haskell : ML() {
    override val name = "Haskell"
    override val creator = "Simon Peyton Jones"
    override val year = 1990
    override val extensions = setOf(".hs", ".lhs")
    override val paradigms = setOf(Paradigm.Functional)
    override val runtype = setOf(RunType.Interpreted)
    override val isStrictlyEvaluated = false
}
