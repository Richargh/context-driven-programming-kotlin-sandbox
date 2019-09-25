package de.richargh.sandbox.cdp.addition.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AdderTest {
    @Test
    fun `2 + 2 is 4`() {
        // arrange

        // act
        val actual = add(2.0, 2.0)

        // assert
        assertThat(actual).isEqualTo(4.0)
    }
}