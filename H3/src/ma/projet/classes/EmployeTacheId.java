/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.projet.classes;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class EmployeTacheId implements Serializable {
  private int employe_id;
    private int tache_id;

    public EmployeTacheId() {
    }

    public EmployeTacheId(int employe_id, int tache_id) {
        this.employe_id = employe_id;
        this.tache_id = tache_id;
    }

    public int getEmploye_id() {
        return employe_id;
    }

    public void setEmploye_id(int employe_id) {
        this.employe_id = employe_id;
    }

    public int getTache_id() {
        return tache_id;
    }

    public void setTache_id(int tache_id) {
        this.tache_id = tache_id;
    }

    @Override
    public String toString() {
        return "EmployeTacheId{" + "employe_id=" + employe_id + ", tache_id=" + tache_id + '}';
    }
    
}
