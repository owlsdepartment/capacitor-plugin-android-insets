export interface AndroidInsetsPlugin {
  top(): Promise<TopReturn>;
}

export interface TopReturn {
  value: number;
}
