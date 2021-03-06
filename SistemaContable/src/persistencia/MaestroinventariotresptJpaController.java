/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Maestroinventariotrespt;
import persistencia.exceptions.NonexistentEntityException;
import persistencia.exceptions.PreexistingEntityException;

/**
 *
 * @author Jhon
 */
public class MaestroinventariotresptJpaController implements Serializable {

    public MaestroinventariotresptJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Maestroinventariotrespt maestroinventariotrespt) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(maestroinventariotrespt);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findMaestroinventariotrespt(maestroinventariotrespt.getCodigo()) != null) {
                throw new PreexistingEntityException("Maestroinventariotrespt " + maestroinventariotrespt + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Maestroinventariotrespt maestroinventariotrespt) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            maestroinventariotrespt = em.merge(maestroinventariotrespt);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                String id = maestroinventariotrespt.getCodigo();
                if (findMaestroinventariotrespt(id) == null) {
                    throw new NonexistentEntityException("The maestroinventariotrespt with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(String id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Maestroinventariotrespt maestroinventariotrespt;
            try {
                maestroinventariotrespt = em.getReference(Maestroinventariotrespt.class, id);
                maestroinventariotrespt.getCodigo();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The maestroinventariotrespt with id " + id + " no longer exists.", enfe);
            }
            em.remove(maestroinventariotrespt);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Maestroinventariotrespt> findMaestroinventariotresptEntities() {
        return findMaestroinventariotresptEntities(true, -1, -1);
    }

    public List<Maestroinventariotrespt> findMaestroinventariotresptEntities(int maxResults, int firstResult) {
        return findMaestroinventariotresptEntities(false, maxResults, firstResult);
    }

    private List<Maestroinventariotrespt> findMaestroinventariotresptEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Maestroinventariotrespt.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Maestroinventariotrespt findMaestroinventariotrespt(String id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Maestroinventariotrespt.class, id);
        } finally {
            em.close();
        }
    }

    public int getMaestroinventariotresptCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Maestroinventariotrespt> rt = cq.from(Maestroinventariotrespt.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
