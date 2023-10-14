package InMemoryModel;

import ModelElements.Camera;
import ModelElements.Flash;
import ModelElements.PoligonalModel;
import ModelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ModelStore implements ModelChanger, ModelChangedObserver{

    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    public List<PoligonalModel> Models; 
    public List<Scene> Scenes; 
    public List<Flash> Flashes; 
    public List<Camera> Cameras; 

    public Scene getScene(int n_scene) {

    return Scenes.get(n_scene);
  }

  @Override
    public void registerModelChanger(ModelChangedObserver o) {
        changeObservers.add(o);
    }

    @Override
    public void removeModelChanger(ModelChangedObserver o) {
        changeObservers.remove(o);
    }

    @Override
    public void applyUpdateModel() {
        // TODO Auto-generated method stub
    }

    @Override
    public void notifyChange() {
        // TODO Auto-generated method stub
    }

}