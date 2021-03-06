package uo.sdm.mapintegrationapp.model.types;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import uo.sdm.mapintegrationapp.R;

/**
 * Created by Hans on 25/06/2015.
 */
public enum PlaceType {
    Cave(R.drawable.cave, R.drawable.cave_grey),
    Desert(R.drawable.desert, R.drawable.desert_grey),
    Dungeon(R.drawable.dungeon, R.drawable.dungeon_grey),
    Forest(R.drawable.forest, R.drawable.forest_grey),
    Garden(R.drawable.garden, R.drawable.garden_grey),
    Mountain(R.drawable.mountain, R.drawable.mountain_grey),
    River(R.drawable.river, R.drawable.river_grey);

    private static final List<PlaceType> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static  final int SIZE = VALUES.size();
    private static  final Random RANDOM = new Random();

    private final int resource_id;
    private final int greyResource_id;

    PlaceType(int resource_id, int greyResource_id) {
        this.resource_id = resource_id;
        this.greyResource_id = greyResource_id;
    }

    public int getResource_id() {
        return resource_id;
    }

    public int getGreyResource_id() {
        return greyResource_id;
    }

    public static PlaceType randomPlaceType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
