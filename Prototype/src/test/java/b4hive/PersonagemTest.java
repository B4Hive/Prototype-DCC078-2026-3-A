package b4hive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

class PersonagemTest {

    @Test
    void deveClonarPersonagem() throws CloneNotSupportedException {
        Personagem original = new Personagem(
                "Aragorn",
                "Guerreiro",
                new Inventario("Espada", 3),
                10);

        Personagem clone = original.clone();
        clone.setNome("Boromir");
        clone.setNivel(12);
        clone.getInventario().setArma("Machado");
        clone.getInventario().setQuantidadeVidas(5);

        assertEquals("Personagem{nome='Aragorn', classe='Guerreiro', arma='Espada', vidas=3, nivel=10}", original.toString());
        assertEquals("Personagem{nome='Boromir', classe='Guerreiro', arma='Machado', vidas=5, nivel=12}", clone.toString());
    }

    @Test
    void deveCriarInventariosIndependentesNoClone() throws CloneNotSupportedException {
        Personagem original = new Personagem(
                "Mago",
                "Feiticeiro",
                new Inventario("Cajado", 2),
                8);

        Personagem clone = original.clone();
        clone.getInventario().setQuantidadeVidas(4);

        assertNotSame(original.getInventario(), clone.getInventario());
        assertEquals(2, original.getInventario().getQuantidadeVidas());
        assertEquals(4, clone.getInventario().getQuantidadeVidas());
    }
}
