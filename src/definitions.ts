export interface AndroidInsetsPlugin {
  /**
   * Returns top offset of the status bar
   */
  top(): Promise<TopReturn>;
}

export interface TopReturn {
  value: number;
}
