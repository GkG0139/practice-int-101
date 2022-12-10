package os;

import application.Application;
import java.util.Arrays;

public class OS {

  private int id = 0;
  private static int latestId = 0;

  private String name;

  private Application[] apps;

  private int storageSize = 0;
  private int usedStorage = 0;

  private int count = 1;

  public OS(String name, int storageSize) {
    this.id = latestId++;
    this.name = name;
    this.storageSize = storageSize;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public Application[] getApps() {
    return apps;
  }

  public int getStorageSize() {
    return storageSize;
  }

  public int getUsedStorage() {
    return usedStorage;
  }

  public boolean addApplication(Application newApplication) {
    if (usedStorage + newApplication.getSize() > storageSize) return false;

    if (count == 0) {
      apps = new Application[1];
      apps[count++] = newApplication;
    } else {
      Application[] temp = new Application[count];

      for (int i = 0; i < count; i++) {
        if (i == count - 1) temp[i] = newApplication; else temp[i] = apps[i];
      }
      apps = temp;
      count++;
    }
    usedStorage = newApplication.getSize() + usedStorage;
    return true;
  }

  public void removeApplication(int id) {
    if (count <= 0) return;

    count--;
    int tempCount = 0;
    Application[] temp = new Application[count - 1];
    for (int i = 0; i < count; i++) {
      if (apps[i].getId() == id) {
        usedStorage -= apps[i].getSize();
        continue;
      }
      temp[tempCount++] = apps[i];
    }
    apps = temp;
  }

  public Application getApplicationIdByName(String name) {
    for (int i = 0; i < count; i++) {
      if (name.equals(apps[i].getName())) return apps[i];
    }
    return null;
  }

  @Override
  public String toString() {
    return (
      "OS [id=" +
      id +
      ", name=" +
      name +
      ", apps=" +
      Arrays.toString(apps) +
      ", storageSize=" +
      storageSize +
      ", usedStorage=" +
      usedStorage +
      ", count=" +
      count +
      "]"
    );
  }
}
