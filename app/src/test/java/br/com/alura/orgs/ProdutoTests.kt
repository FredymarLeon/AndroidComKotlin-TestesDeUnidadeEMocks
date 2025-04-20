package br.com.alura.orgs


import br.com.alura.orgs.model.Produto
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.amshove.kluent.shouldNotBeTrue
import org.junit.Assert.*
import org.junit.Test
import java.math.BigDecimal

class ProdutoTests {

    @Test
    fun `deve retornar verdadeiro quando o valor do produto for valido`(){
        val produtoValido = Produto(
            nome = "Fresa",
            descricao = "Fruta",
            valor = BigDecimal("9.99")
        )

        val valorEhValido = produtoValido.valorValido

        //Kluent
        valorEhValido.shouldBeTrue()
//        valorEhValido shouldBeEqualTo true

//        assertTrue(valorEhValido)
//        Assert.assertEquals(true, valorEhValido)
    }

//    @Test
//    fun `Ao criar um produto com o valor errado o valor deveria ser falso`(){
//        //Arrange - Arrumar
//        val produtoInvalido = Produto(
//            nome = "Mandarina",
//            descricao = "Anaranjada",
//            valor = BigDecimal("150.99")
//        )
//
//        //Act - Agir
//        val valorEhValido = produtoInvalido.valorValido
//
//        //Assert - Adirme
//        Assert.assertEquals(false, valorEhValido)
//    }

    @Test
    fun `deve retornar falso quando o valor do produto for maior que cem`(){

        val produtoComValorMaiorQueCem = Produto(
            nome = "Manzana",
            descricao = "Verde",
            valor = BigDecimal("108.99")
        )

        val valorMaiorQueCem = produtoComValorMaiorQueCem.valorValido

        //Kluent
        valorMaiorQueCem.shouldBeFalse()
//        valorMaiorQueCem shouldBeEqualTo false

//        assertFalse(valorMaiorQueCem)
//        Assert.assertEquals(false, valorMaiorQueCem)
    }

    @Test
    fun `deve retornar falso quando o valor do produto for menor ou igual que zero`(){

        val produtoComValorMenorQueZero = Produto(
            nome = "Pera",
            descricao = "Madura y jugosa",
            valor = BigDecimal("-18.99")
        )
        val produtoComValorIgualQueZero = Produto(
            nome = "Patilla",
            descricao = "Jugosa",
            valor = BigDecimal("-42.98")
        )

        val valorMenorQueZero = produtoComValorMenorQueZero.valorValido
        val valorIgualQueZero = produtoComValorIgualQueZero.valorValido

        //Kluent
        valorMenorQueZero.shouldBeFalse()
        valorIgualQueZero.shouldBeFalse()
//        valorMenorQueZero shouldBeEqualTo false
//        valorIgualQueZero shouldBeEqualTo false

//        assertFalse(valorMenorQueZero)
//        assertFalse(valorIgualQueZero)
//        Assert.assertEquals(false, valorMenorQueZero)
//        Assert.assertEquals(false, valorIgualQueZero)
    }

}