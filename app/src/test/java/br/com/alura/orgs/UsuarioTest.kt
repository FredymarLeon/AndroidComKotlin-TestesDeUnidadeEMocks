package br.com.alura.orgs

import br.com.alura.orgs.model.Usuario
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Assert
import org.junit.Test

class UsuarioTest {

    @Test
    fun `deve retorna verdadeiro quando email e senha sao corretos`(){

        val usuarioValido = Usuario(
            email = "flr_164@hotmail.com",
            senha = "123Dios",
            id = "2"
        )

        val usuarioEhValido = usuarioValido.ehValido()

        usuarioEhValido.shouldBeTrue()
//        usuarioEhValido shouldBeEqualTo true
//        Assert.assertTrue(usuarioEhValido)
    }

//    @Test
//    fun `retomar usuario invalido (false) quando email e senha sao incorretos`(){
//
//        val usuarioInvalido = Usuario(
//            email = "flr_164@hotmail.com",
//            senha = "125",
//            id = "3"
//        )
//
//        val usuarioEhValido = usuarioInvalido.ehValido()
//
//        Assert.assertFalse(usuarioEhValido)
//    }

    @Test
    fun `deve retornar False quando o email do usuario estiver errado`(){

        val usuarioInvalido = Usuario(
            email = "flr_164hotmail.com",
            senha = "1234568970",
            id = "6"
        )

        val emailErrado = usuarioInvalido.ehValido()

        emailErrado.shouldBeFalse()
//        emailErrado shouldBeEqualTo false
//        Assert.assertFalse(emailErrado)
    }

    @Test
    fun `deve retornar falso quando a senha do usuario tiver menos de 6 carateres`(){

        val usuarioInvalido = Usuario(
        email = "flr_164@hotmail.com",
        senha = "1478",
        id = "9"
        )

        val senhaErrada = usuarioInvalido.ehValido()

        senhaErrada.shouldBeFalse()
//        senhaErrada shouldBeEqualTo false
//        Assert.assertFalse(senhaErrada)
    }

}