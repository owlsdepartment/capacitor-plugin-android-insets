export interface AndroidInsetsPlugin {
  /**
   * Returns top offset of the status bar
   */
  top(): Promise<TopReturn>;

  /**
   * Returns bottom offset of the navigation bar
   */
  bottom(): Promise<BottomReturn>;
}

export interface TopReturn {
  value: number;
}

export interface BottomReturn {
  value: number;
}
