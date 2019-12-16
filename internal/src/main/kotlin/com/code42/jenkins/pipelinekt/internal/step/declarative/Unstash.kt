package com.code42.jenkins.pipelinekt.internal.step.declarative

import com.code42.jenkins.pipelinekt.core.step.DeclarativeStep
import com.code42.jenkins.pipelinekt.core.step.SingletonStep
import com.code42.jenkins.pipelinekt.core.vars.Var
import com.code42.jenkins.pipelinekt.core.writer.GroovyWriter

data class
Unstash(val name: Var.Literal.Str) : DeclarativeStep, SingletonStep {
    override fun toGroovy(writer: GroovyWriter) {
        writer.writeln("unstash ${name.toGroovy()}")
    }
}
