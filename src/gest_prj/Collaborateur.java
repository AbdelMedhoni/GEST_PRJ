package gest_prj;

import java.util.ArrayList;

public class Collaborateur implements InterCollaborateur {

	private int cd_collabo;
	private int nom_prenom;
	private int adresse;
	private int disponibilite;
	private int experience;
        private ArrayList<Competence> cmpTech;
        private ArrayList<Competence> cmpRel;
        private ArrayList<Competence> cmpPers;
    
    
        public  ArrayList<Competence> setCmpPers(Collaborateur C)   
            
            {
            ArrayList T = new ArrayList();
            T.add(new Competence(1,"Autonomie"));
            T.add(new Competence(2,"Motivation"));
            T.add(new Competence(3,"Volonte"));
            T.add(new Competence(4,"Resistance"));
            return T;
            }

    @Override
    public void optiCompetence(ArrayList<Competence> Cmp, Collaborateur C) {

    }

    @Override
    public void optiProfil(Profil P, Collaborateur C) {

    }

    @Override
    public ArrayList<Competence> getCompCollaborateur(Collaborateur C) {
            return null;

    }

}