package br.com.alura.orgs.database.repository

import br.com.alura.orgs.database.dao.ProdutoDao
import br.com.alura.orgs.model.Produto
import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.math.BigDecimal

class ProdutoRepositoryTest {

    @org.junit.jupiter.api.Test
    @Test
    fun `deve chamar o dao quando salva um produto`() = runTest {

        //Arrange - Config
        val dao = mockk<ProdutoDao>()
        val produtoRepository = ProdutoRepository(dao)
        val produto = Produto(
            nome = "Manga",
            descricao = "Manga Madura",
            valor = BigDecimal("8.89")
        )

        coEvery {
            dao.salva(produto)
        }.returns(Unit)

        //Act
        produtoRepository.salva(produto)

        coVerify {
            dao.salva(produto)
        }
    }

}