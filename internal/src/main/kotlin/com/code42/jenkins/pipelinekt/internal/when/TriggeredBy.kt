package com.code42.jenkins.pipelinekt.internal.`when`

import com.code42.jenkins.pipelinekt.core.Cause
import com.code42.jenkins.pipelinekt.core.When
import com.code42.jenkins.pipelinekt.core.writer.GroovyWriter

data class TriggeredBy(val cause: Cause) : When {
    override fun toGroovy(writer: GroovyWriter) {
        writer.writeln("triggeredBy ${cause.toGroovy()}")
    }
}
