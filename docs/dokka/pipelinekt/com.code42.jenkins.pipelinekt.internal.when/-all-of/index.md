[pipelinekt](../../index.md) / [com.code42.jenkins.pipelinekt.internal.when](../index.md) / [AllOf](./index.md)

# AllOf

`data class AllOf : `[`When`](../../com.code42.jenkins.pipelinekt.core/-when.md) [(source)](https://github.com/code42/pipelinekt/tree/master/internal/src/main/kotlin/com/code42/jenkins/pipelinekt/internal/when/AllOf.kt#L7)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `AllOf(whenStatements: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`When`](../../com.code42.jenkins.pipelinekt.core/-when.md)`>)` |

### Properties

| Name | Summary |
|---|---|
| [whenStatements](when-statements.md) | `val whenStatements: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`When`](../../com.code42.jenkins.pipelinekt.core/-when.md)`>` |

### Functions

| Name | Summary |
|---|---|
| [toGroovy](to-groovy.md) | `fun toGroovy(writer: `[`GroovyWriter`](../../com.code42.jenkins.pipelinekt.core.writer/-groovy-writer/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
