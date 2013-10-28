package net.naprav.wardungeon.graphics;

public class ClassSprite {

	private int x, y;
	public final int SIZE;
	private SpriteSheet sheet;

	public int[] pixels;

	/**
	 * Constructor for creating a class sprite for each class.
	 * 
	 * @param sheet
	 * @param x
	 * @param y
	 * @param size
	 */
	public ClassSprite(SpriteSheet sheet, int x, int y, int size) {
		SIZE = size;
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;

		pixels = new int[SIZE * SIZE];
		loadPlayer();
	}

	public static ClassSprite knight = new ClassSprite(SpriteSheet.knight, 0, 0, 64);
	public static ClassSprite mage = new ClassSprite(SpriteSheet.wizard, 0, 0, 64);
	public static ClassSprite archer = new ClassSprite(SpriteSheet.archer, 0, 0, 64);

	/**
	 * Method for loading the player to the pixels[] array.
	 */
	private final void loadPlayer() {
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				pixels[x + (y * SIZE)] = sheet.pixels[(this.x + x) + (this.y + y) * sheet.SIZE];
			}
		}
	}
}
