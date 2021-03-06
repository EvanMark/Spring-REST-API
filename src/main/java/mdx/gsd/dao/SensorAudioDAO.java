package mdx.gsd.dao;

import mdx.gsd.data.model.SensorAudio;

import java.util.List;

/**
 * Created by universe (E.) on 12/06/17.
 */

public interface SensorAudioDAO {

    void addSensorAudio(SensorAudio sensorAudio);

    void updateSensorAudio(SensorAudio sensorAudio);

    SensorAudio getSensorAudioById(Integer id);

    List<SensorAudio> getUserSensorAudio(String id);

    List<SensorAudio> getAllSensorAudio();

    void removeSensorAudio(Integer id);
}
