[pipelinekt](../index.md) / [com.code42.jenkins.pipelinekt.dsl.when](./index.md)

## Package com.code42.jenkins.pipelinekt.dsl.when

### Functions

| Name | Summary |
|---|---|
| [allOf](all-of.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.allOf(allOfBlock: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [anyOf](any-of.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.anyOf(anyOfBlock: `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [beforeAgent](before-agent.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.beforeAgent(enabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [beforeInput](before-input.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.beforeInput(enabled: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [branch](branch.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.branch(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.branch(name: Str): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.branch(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, comparator: `[`Comparator`](../com.code42.jenkins.pipelinekt.core/-comparator/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.branch(pattern: Str, comparator: `[`Comparator`](../com.code42.jenkins.pipelinekt.core/-comparator/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [buildingTag](building-tag.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.buildingTag(): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [changelog](changelog.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.changelog(regex: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.changelog(regex: Str): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [changeRequest](change-request.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.changeRequest(changeRequestType: `[`ChangeRequestType`](../com.code42.jenkins.pipelinekt.internal.when/-change-request-type/index.md)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, comparator: `[`Comparator`](../com.code42.jenkins.pipelinekt.core/-comparator/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.changeRequest(changeRequestType: `[`ChangeRequestType`](../com.code42.jenkins.pipelinekt.internal.when/-change-request-type/index.md)`, value: Str, comparator: `[`Comparator`](../com.code42.jenkins.pipelinekt.core/-comparator/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [changeSet](change-set.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.changeSet(glob: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, caseSensitive: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.changeSet(glob: Str, caseSensitive: Bool): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [environment](environment.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.environment(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, value: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.environment(name: Environment, value: Str): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [equals](equals.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.equals(expected: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`, actual: `[`Var`](../com.code42.jenkins.pipelinekt.core.vars/-var/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [expression](expression.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.expression(statementBlock: () -> `[`BooleanStatement`](../com.code42.jenkins.pipelinekt.core.conditional/-boolean-statement/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [literal](literal.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.literal(codeBlock: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [not](not.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.not(notBlock: `[`SingletonDslContext`](../com.code42.jenkins.pipelinekt.dsl/-singleton-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.() -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [tag](tag.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.tag(name: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.tag(name: Str): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.tag(pattern: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, comparator: `[`Comparator`](../com.code42.jenkins.pipelinekt.core/-comparator/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.tag(pattern: Str, comparator: `[`Comparator`](../com.code42.jenkins.pipelinekt.core/-comparator/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [triggeredBy](triggered-by.md) | `fun `[`DslContext`](../com.code42.jenkins.pipelinekt.dsl/-dsl-context/index.md)`<`[`When`](../com.code42.jenkins.pipelinekt.core/-when.md)`>.triggeredBy(cause: `[`Cause`](../com.code42.jenkins.pipelinekt.core/-cause/index.md)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |