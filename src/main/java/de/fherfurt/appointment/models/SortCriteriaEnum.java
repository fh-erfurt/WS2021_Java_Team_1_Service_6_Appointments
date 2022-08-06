package de.fherfurt.appointment.models;

/**
 * enum which predefines all later used sort criteria for appointment sorting
 * ASC = ascending
 * DSC = descending
 *
 * @author helmboldt
 */
public enum SortCriteriaEnum {
    NAME_ASC,
    NAME_DSC,
    DATE_ASC,
    DATE_DSC,
    CREATOR_ASC,
    CREATOR_DSC,
    CAMPUSLOCATION_ASC,
    CAMPUSLOCATION_DSC,
    UNDEFINED
}
