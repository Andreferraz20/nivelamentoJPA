package aplicativo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {
    public static void main(String[] args) {

      
        
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        
        Pessoa pessoa = entityManager.find(Pessoa.class, 2);
        
        entityManager.getTransaction().begin();
        
        entityManager.remove(pessoa);
        
        entityManager.getTransaction().commit();
        
        System.out.println("Pronto!");
        entityManager.close();
        entityManagerFactory.close();
    }
}
