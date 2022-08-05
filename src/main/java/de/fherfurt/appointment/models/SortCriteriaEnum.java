package de.fherfurt.appointment.models;

/**
 * The enum Sort criteria enum define all Cretias.
 * @author  helmboldt
 */
public enum SortCriteriaEnum {
    /**
     * sort by Name in direction from A to Z.
     */
    NAME_ASC,
    /**
     * sort by Name in direction from Z to A.
     */
    NAME_DSC,
    /**
     * sort by Date in direction from oldest to newest.
     */
    DATE_ASC,
    /**
     * sort by Date in direction from newest to oldest .
     */
    DATE_DSC,
    /**
     * sort by Creator in direction from A to Z.
     */
    CREATOR_ASC,
    /**
     * sort by Creator in direction from Z to A.
     */
    CREATOR_DSC,
    /**
     * sort by Campuslocation in direction from A to Z.
     */
    CAMPUSLOCATION_ASC,
    /**
     * sort by Campuslocation in direction from Z to A.
     */
    CAMPUSLOCATION_DSC,
    /**
     * Undefined sort criteria enum.
     */
    UNDEFINED
}
