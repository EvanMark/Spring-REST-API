package mdx.gsd.dao;

import mdx.gsd.data.model.SurveyPaei;

import java.util.List;

/**
 * Created by universe (E.) on 12/06/17.
 */

public interface SurveyPaeiDAO {

    void addSurveyPaei(SurveyPaei surveyPaei);

    void updateSurveyPaei(SurveyPaei surveyPaei);

    SurveyPaei getSurveyPaeiById(Integer id);

    List<SurveyPaei> getAllSurveyPaei();

    List<SurveyPaei> getUserSurveyPaei(String id);

    void removeSurveyPaei(Integer id);
}
